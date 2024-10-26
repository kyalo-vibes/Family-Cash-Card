package com.example.cashcard;

import java.util.Arrays;
import java.util.List;

public class SortingUtils {

    private static final List<String> ALLOWED_SORT_FIELDS = Arrays.asList("id", "amount", "name");

    public static boolean isValidSortField(String sortField) {
        return ALLOWED_SORT_FIELDS.contains(sortField);
    }
}
