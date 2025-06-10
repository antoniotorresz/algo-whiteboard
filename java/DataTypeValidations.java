public class DataTypeValidations {
    static class Error {
        private Integer row;
        private Integer column;
        private String message;

        public Error() {
            this.row = 0;
            this.column = 0;
            this.message = "Error in validation";
        }

        public Integer getRow() {
            return row;
        }

        public void setRow(Integer row) {
            this.row = row;
        }

        public Integer getColumn() {
            return column;
        }

        public void setColumn(Integer column) {
            this.column = column;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

    private static Object validateCell(final Object input) {
        if (input instanceof Integer) {
            return 1000;
        } else if (input instanceof String) {
            return "Hello, World!";
        } else if (input instanceof Boolean bool) {
            return !bool;
        }
        return new Error();
    }

    public static void main(String[] args) {
        Boolean validInteger = validateCell(10) instanceof Integer;
        Boolean validString = validateCell("Hello, World!") instanceof String;
        Boolean validBoolean = validateCell(true) instanceof Boolean;
        Boolean validError = validateCell(10.0) instanceof Error;
        System.err.println("Valid Integer: " + validInteger);
        System.err.println("Valid String: " + validString);
        System.err.println("Valid Boolean: " + validBoolean);
        System.err.println("Valid Error: " + validError);
    }
}
