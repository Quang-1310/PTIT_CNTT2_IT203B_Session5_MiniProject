package service;

import model.MenuItem;

import java.util.Map;

public class StatisticService implements IStatisticService {
    @Override
    public double calculatedTotalRevenue() {
        return 0;
    }

    @Override
    public Map<MenuItem, Integer> getTopSellingItems() {
        return Map.of();
    }
}
