package kodlama.io.rentACar.dataAcces.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository {
	List<Brand> getAll();               // getAll'u çağıran herkes markaları listeler
}
