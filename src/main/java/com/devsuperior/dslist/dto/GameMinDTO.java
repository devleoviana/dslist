package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private Long shortDescription;

    public GameMinDTO() {

    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title =  entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = Long.valueOf(entity.getShortDescription());
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title =  projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Long getShortDescription() {
        return shortDescription;
    }
}
