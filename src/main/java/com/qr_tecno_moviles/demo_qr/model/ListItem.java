package com.qr_tecno_moviles.demo_qr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class ListItem implements Serializable {

    private Long id;

    private String title;

    private String roomName;

    private String itemMainPicture;

}
