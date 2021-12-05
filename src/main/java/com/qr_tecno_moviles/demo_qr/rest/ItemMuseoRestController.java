package com.qr_tecno_moviles.demo_qr.rest;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.qr_tecno_moviles.demo_qr.business.IItemMuseoBusiness;
import com.qr_tecno_moviles.demo_qr.exceptions.BusinessException;
import com.qr_tecno_moviles.demo_qr.model.ItemMuseo;
import com.qr_tecno_moviles.demo_qr.model.ListItem;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@Slf4j
public class ItemMuseoRestController {

    private IItemMuseoBusiness itemMuseoBusiness;

    @GetMapping(value = "/items-museo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ListItem>> listado () {
            return new ResponseEntity<>(itemMuseoBusiness.listAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/item-museo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemMuseo> getItem (@RequestParam("qr") Long qr) {
        try {
            return new ResponseEntity<>(itemMuseoBusiness.load(qr), HttpStatus.OK);
        } catch (BusinessException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/crear", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> crearQR (@RequestParam("qr") String qr) {
        try {
            return new ResponseEntity<>(generateQRCodeImage(qr), HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Bean
    public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
        return new BufferedImageHttpMessageConverter();
    }


    public static BufferedImage generateQRCodeImage(String barcodeText) throws Exception {
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix =
                barcodeWriter.encode(barcodeText, BarcodeFormat.QR_CODE, 200, 200);

        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }


}
