package pl.arcadio.linkshortening;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/links")
public class LinkResource {
    private final LinkService linkService;

    public LinkResource(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping
    ResponseEntity<LinkDto> save(@RequestBody LinkCreateDto link){
        LinkDto linkDto = linkService.shortenLink(link);
        URI savedEntityLocation = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/{id}")
                .buildAndExpand(linkDto.getId())
                .toUri();
        return ResponseEntity.created(savedEntityLocation).body(linkDto);
    }

    @GetMapping("/{id}")
    ResponseEntity<?> findById(@PathVariable String id){
        return linkService.findLinkById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
