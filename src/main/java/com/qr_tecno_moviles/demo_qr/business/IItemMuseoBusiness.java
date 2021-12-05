package com.qr_tecno_moviles.demo_qr.business;

import com.qr_tecno_moviles.demo_qr.exceptions.BusinessException;
import com.qr_tecno_moviles.demo_qr.model.ItemMuseo;
import com.qr_tecno_moviles.demo_qr.model.ListItem;

import java.util.List;

public interface IItemMuseoBusiness {

    List<ListItem> listAll();

    ItemMuseo load(Long id) throws BusinessException;
}
