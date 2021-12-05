package com.qr_tecno_moviles.demo_qr.business;

import com.qr_tecno_moviles.demo_qr.exceptions.BusinessException;
import com.qr_tecno_moviles.demo_qr.model.ItemMuseo;
import com.qr_tecno_moviles.demo_qr.model.ListItem;
import com.qr_tecno_moviles.demo_qr.persistence.ItemMuseoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class ItemMuseoBusiness implements IItemMuseoBusiness {

    private ItemMuseoRepository itemMuseoRepository;

    @Override
    public List<ListItem> listAll(){
       return itemMuseoRepository.findAll()
               .stream()
               .map(itemMuseo -> ListItem.builder()
                       .id(itemMuseo.getId())
                       .title(itemMuseo.getItemTitle())
                       .roomName(itemMuseo.getRoomName())
                       .itemMainPicture(itemMuseo.getItemMainPicture())
                       .build()).collect(Collectors.toList());
    }

    @Override
    public ItemMuseo load(Long id) throws BusinessException {
        Optional<ItemMuseo> o;
        try {
            o = itemMuseoRepository.findFirstById(id);
        } catch (Exception e) {
            throw new BusinessException(e.getMessage(), e);
        }
        if (o.isEmpty())
            throw new BusinessException("No hay un item con ese QR");
        return o.get();
    }
}
