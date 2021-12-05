package com.qr_tecno_moviles.demo_qr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@Table(name="items_galeria")
public class ItemGallery implements Serializable {

    private static final long serialVersionUID = -4871142170558316526L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String url;

    @Lob
    private String description;
}
