package pl.arcadio.linkshortening;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkCreateDto {
    private String name;
    private String targetUrl;
}
