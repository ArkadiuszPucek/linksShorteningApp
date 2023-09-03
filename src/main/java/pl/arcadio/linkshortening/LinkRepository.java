package pl.arcadio.linkshortening;

import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository<Link, String> {
}
