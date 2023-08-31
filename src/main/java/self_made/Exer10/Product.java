package self_made.Exer10;

import java.time.LocalDate;
interface Product {
    double getPrice();
    boolean isAvailable(LocalDate date);
}