package pl.arcadio.linkshortening.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkCreateDto {
    private String name;
    private String password;
    private String targetUrl;
}
