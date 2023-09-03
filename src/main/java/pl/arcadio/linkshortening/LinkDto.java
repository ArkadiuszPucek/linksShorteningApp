package pl.arcadio.linkshortening;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class LinkDto {
    private String id;
    private String name;
    private String targetUrl;
    private String redirectUrl;
    private int visits;
}
