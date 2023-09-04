package pl.arcadio.linkshortening;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Link {

    @Id
    private String id;
    private String name;
    private String password;
    private String targetUrl;
    private int visits;

    public Link(String id, String name, String password, String targetUrl) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.targetUrl = targetUrl;
    }
}
