package service;

import java.awt.*;
import java.util.List;

public class SearchService implements ISearchService {
    @Override
    public List<MenuItem> findByName(String name) {
        return List.of();
    }

    @Override
    public List<MenuItem> findByPriceRange(double minPrice, double maxPrice) {
        return List.of();
    }
}
