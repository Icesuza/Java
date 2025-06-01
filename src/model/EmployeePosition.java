package model;

import java.util.Locale;

public enum EmployeePosition {
    MANAGER,
    SALE,
    MARKETING;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
