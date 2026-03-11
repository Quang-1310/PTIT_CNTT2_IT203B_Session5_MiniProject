package service;

import model.MenuItem;

import java.util.List;
import java.util.Map;

public interface IStatisticService {
    double calculatedTotalRevenue();
    Map<MenuItem,Integer> getTopSellingItems();
}
