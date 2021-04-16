package patterns.starbucks.data;

public class Coffee extends Product {

    public static class Builder {

        private final String forWhom;
        private CoffeeType coffeeType;
        private boolean withSugar = false;
        private boolean withMilk = false;

        public Builder(String clientName) {
            this.forWhom = clientName;
        }

        public Builder coffeeType(CoffeeType coffeeType) {
            this.coffeeType = coffeeType;
            return this;
        }

        public Builder withSugar(boolean withSugar) {
            this.withSugar = withSugar;
            return this;
        }

        public Builder withMilk(boolean withMilk) {
            this.withMilk = withMilk;
            return this;
        }

        public Coffee build() {
            return new Coffee(forWhom, coffeeType, withSugar, withMilk);
        }
    }

    private final String forWhom;
    private final CoffeeType coffeeType;
    private final boolean withSugar;
    private final boolean withMilk;

    private Coffee(String forWhom, CoffeeType coffeeType, boolean withSugar, boolean withMilk) {
        this.forWhom = forWhom;
        this.coffeeType = coffeeType;
        this.withSugar = withSugar;
        this.withMilk = withMilk;
    }

    @Override
    public String toString() {
        return "Кофе{" + "для=" + forWhom + ", тип кофе=" + coffeeType + ", с сахаром=" + withSugar + ", с молоком=" + withMilk + '}';
    }
}
