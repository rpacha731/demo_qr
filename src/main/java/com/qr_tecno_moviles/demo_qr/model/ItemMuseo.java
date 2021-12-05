package com.qr_tecno_moviles.demo_qr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@Table(name="items_museo")
public class ItemMuseo implements Serializable {

    private static final long serialVersionUID = -4871142170558316526L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemTitle;

    private String roomName;

    @Lob
    private String itemIntro;

    private String itemMainContent;

    private String itemMainPicture;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemGallery> itemGallery;

    private String itemYoutube;

    private String itemTags;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemExternalLink> itemExternalLinks;

    private String itemLat;

    private String itemLong;

    private String itemAudioLink;

}
