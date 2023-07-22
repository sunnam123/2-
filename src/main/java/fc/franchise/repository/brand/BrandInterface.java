package fc.franchise.repository.brand;

import fc.franchise.domain.Brand;

import java.util.List;

public interface BrandInterface {
    List<Brand> findAll();


    List<Brand> departure();


    List<Brand> findTop3(String category);
}