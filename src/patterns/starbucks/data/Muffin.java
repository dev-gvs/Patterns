package patterns.starbucks.data;

public class Muffin extends Product {

    public static class Builder {

        private final String forWhom;
        private boolean withChocolate = true;
        private boolean withBanana = false;

        public Builder(String clientName) {
            this.forWhom = clientName;
        }

        public Builder withChocolate(boolean withChocolate) {
            this.withChocolate = withChocolate;
            return this;
        }

        public Builder withBanana(boolean withBanana) {
            this.withBanana = withBanana;
            return this;
        }

        public Muffin build() {
            return new Muffin(forWhom, withChocolate, withBanana);
        }
    }

    private final String forWhom;
    private final boolean withChocolate;
    private final boolean withBanana;

    private Muffin(String forWhom, boolean withChocolate, boolean withBanana) {
        this.forWhom = forWhom;
        this.withChocolate = withChocolate;
        this.withBanana = withBanana;
    }

    @Override
    public String toString() {
        return "Маффин{" + "для=" + forWhom + ", с шоколадом=" + withChocolate + ", с бананом=" + withBanana + '}';
    }
}
