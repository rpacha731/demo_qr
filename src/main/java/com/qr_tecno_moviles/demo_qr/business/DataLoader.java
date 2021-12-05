package com.qr_tecno_moviles.demo_qr.business;

import com.qr_tecno_moviles.demo_qr.model.ItemExternalLink;
import com.qr_tecno_moviles.demo_qr.model.ItemGallery;
import com.qr_tecno_moviles.demo_qr.model.ItemMuseo;
import com.qr_tecno_moviles.demo_qr.persistence.ItemMuseoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class DataLoader implements CommandLineRunner {

    private ItemMuseoRepository itemMuseoRepository;

    @Override
    public void run(String... args) {

        if (itemMuseoRepository.findAll().isEmpty()) {

            List<ItemGallery> list = new ArrayList<>();

            list.add(ItemGallery.builder()
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Mona_Lisa_detail_face.jpg/330px-Mona_Lisa_detail_face.jpg")
                    .description("Cara mona lisa").build());

            List<ItemExternalLink> links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/La_Gioconda")
                    .name("Wiki").build());


            ItemMuseo itemMuseo = ItemMuseo.builder()
                    .itemTitle("La Giaconda")
                    .roomName("Sala 1")
                    .itemIntro("El Retrato de Lisa Gherardini, esposa de Francesco del Giocondo, ​ más conocido como La Gioconda o La Mona Lisa, es una obra pictórica del polímata renacentista italiano Leonardo da Vinci.")
                    .itemMainContent("La mona lisa")
                    .itemMainPicture("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Leonardo_da_Vinci_-_Mona_Lisa_%28Louvre%2C_Paris%29.jpg/368px-Leonardo_da_Vinci_-_Mona_Lisa_%28Louvre%2C_Paris%29.jpg")
                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=MH3swJ0Tz1g")
                    .itemTags("Arte. mona lisa")
                    .itemExternalLinks(links)
                    .itemLat("-42.556215")
                    .itemLong("-64.69871")
                    .itemAudioLink("")
                    .build();

            this.itemMuseoRepository.save(itemMuseo);
        }

    }
}
