package self_made.Exer10;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;
class GenericProduct implements Product {
    private final Supplier<Double> priceSupplier;
    private final Function<LocalDate, Boolean> availabilityFunction;

    public GenericProduct(Supplier<Double> priceSupplier, Function<LocalDate, Boolean> availabilityFunction) {
        this.priceSupplier = priceSupplier;
        this.availabilityFunction = availabilityFunction;
    }

    @Override
    public double getPrice() {
        return priceSupplier.get();
    }

    @Override
    public boolean isAvailable(LocalDate date) {
        return availabilityFunction.apply(date);
    }
}
