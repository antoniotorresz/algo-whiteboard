
public class PrintATriangle {
    public static void main (String[] args) {
        Triangle triangle = new Triangle(Integer.valueOf(args[0]));
        System.out.println(triangle.shape);
    }

    static class Triangle {
        private final Integer height;
        private String shape;

        public Triangle(Integer height) {
            this.height = height;
            this.shape = createShape();
        }

        private String createShape() {
            if (this.height < 2) {
                return "Not able to create the triangle, the minimun height is 2.";
            }

            String shapeToCreate = "";
            Integer numberOfSpaces = this.height;
            Integer numberOfStars = 1;

            while (numberOfSpaces >= 1) {
                for (Integer i = 0; i < numberOfSpaces; i++)  {
                    shapeToCreate += " ";
                }
                for (Integer i = 0; i < numberOfStars; i++) {
                    shapeToCreate += "*";
                }
                for (Integer i = 0; i < numberOfSpaces; i++) {
                    shapeToCreate += " ";
                }
                numberOfStars += 2;
                numberOfSpaces--;
                shapeToCreate += "\n";
            }
            return shapeToCreate;
        }

    }
};
