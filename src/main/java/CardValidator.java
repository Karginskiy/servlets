import javax.validation.constraints.AssertTrue;

public class CardValidator {
    private ValidationAlgorithm validationAlgorithm;
    public CardValidator(@NotNull ValidationAlgorithm validationAlgorithm) {
        this.validationAlgorithm = validationAlgorithm;
    }
    @AssertTrue
    public boolean validate(@NotNull CreditCard creditCard) {
        return validationAlgorithm.validate
    }

    private class ValidationAlgorithm {

        public String validate(String number, Integer controlNumber) {
            Character lastDigit = number.charAt(number.length() - 1);
            return lastDigit.toString();
        }
    }

}
