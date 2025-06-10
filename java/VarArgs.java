import java.util.List;

public class VarArgs {
    static class Result {
        private List<Integer> numbers;
        private Integer sum;

        public Result() {
        }

        public List<Integer> getNumbers() {
            return this.numbers;
        }

        public void setNumbers(List<Integer> _numbers) {
            this.numbers = _numbers;
        }

        public Integer getSum() {
            return this.sum;
        }

        public void setSum(Integer _sum) {
            this.sum = _sum;
        }

        @Override
        public String toString() {
            return "{numbers: " + this.numbers.toString() + " , sum: " + this.sum + " }";
        }
    }

    static Result getResult(final Integer... numbers) {
        Result result = new Result();
        result.setNumbers(List.of(numbers));
        result.setSum(result.getNumbers().stream().mapToInt(Integer::intValue).sum());
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getResult(1, 2, 3, 4, 5, 6, 7, 8, 9).toString());
    }
}