package pl.arcadio.linkshortening;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class LinkDtoMapper {
    public static LinkDto map(Link link){
        String redirectUrl = buildRedirectUrlFromId(link.getId());
        return new LinkDto(link.getId(), link.getName(), link.getTargetUrl(), redirectUrl, link.getVisits());
    }

    private static String buildRedirectUrlFromId(String id) {
        return ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/redir/{id}")
                .buildAndExpand(id)
                .toUriString();
    }
}
