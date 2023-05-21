import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to myFitnessPal!"); //Introductory stuff
        System.out.println("First thing's first, we're going to generate a meal plan for you.");

        System.out.print("\nEnter your height in feet: "); //Obtain user's height and weight. This will be used to get BMI, which will help generate meal plan.
        int heightFeet = scanner.nextInt();

        System.out.print("Enter the remaining inches: ");
        int heightInches = scanner.nextInt();

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        int totalHeightInches = heightFeet * 12 + heightInches; //Multiply feet by 12 to get total height in inches
        double heightMeters = totalHeightInches * 0.0254; // Convert height from inches to meters
        double weightKilograms = weightPounds * 0.45359237; // Convert weight from pounds to kilograms


        double bmi = calculateBMI(heightMeters, weightKilograms);
        String bmiClass = getBMIClassification(bmi);

        System.out.println("\nYour BMI class is: " + bmiClass); //Prints out user's BMI class

        generateMealPlan(bmiClass); // Generates a meal plan based on the user's BMI
        System.out.println("Now that we have a meal plan, we're going to generate a workout schedule to achieve maximum effectiveness.");
        System.out.print("\nEnter the number of days you want to train per week (3-6): ");
        int trainingDays = scanner.nextInt();
        if(trainingDays > 6){
            System.out.print("You should give yourself a rest day, enter a number between 3 and 6: ");
            trainingDays = scanner.nextInt();
        }
        if(trainingDays < 3){
            System.out.print("Try to go at least 3 times a week to establish a routine! (3-6): ");
            trainingDays = scanner.nextInt();
        }

        System.out.print("What skill level would you consider yourself to be at right now? (Beginner/Intermediate/Advanced/Expert): ");
        String skillLevel = scanner.next();
        System.out.println("\nBased on this information, we're going to have you rest on: " + restDays(trainingDays));





        System.out.println("Please note that the provided information is generalized, and if you wish to pursue this passion further, it is recommended to conduct your own research.");

    }
    private static double calculateBMI(double height, double weight) { //Method to calculate the numerical BMI
        return weight / (height * height);
    }

    private static String getBMIClassification(double bmi) { //Method to classify the numerical BMI
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Average";
        } else {
            return "Overweight";
        }
    }
    private static void generateMealPlan(String bmiClass) {
        if(bmiClass.equals("Underweight")){
            System.out.println("Since you are underweight, we are going to generate a meal plan that encourages healthy weight gain. There will be 3 meals and 3 snacks.");
            System.out.println("\n-----BREAKFAST-----");
            System.out.println("(*) Oatmeal topped with sliced almonds and mixed berries");
            System.out.println("(*) Greek yogurt with honey");
            System.out.println("(*) A glass of freshly squeezed orange juice");
            System.out.println("\n-----SNACK #1-----");
            System.out.println("(*) A handful of mixed nuts (almonds, walnuts, cashews)");
            System.out.println("(*) A banana");
            System.out.println("\n-----LUNCH-----");
            System.out.println("(*) Grilled chicken breast with quinoa and roasted vegetables (such as broccoli, bell peppers, and sweet potatoes)");
            System.out.println("(*) A side salad with mixed greens, cherry tomatoes, cucumbers, and a light vinaigrette dressing");
            System.out.println("\n-----SNACK #2-----");
            System.out.println("(*) Hummus with carrot sticks and whole wheat pita bread");
            System.out.println("\n-----Dinner-----");
            System.out.println("(*) Baked salmon with a lemon-dill sauce");
            System.out.println("(*) Brown rice");
            System.out.println("(*) Steamed asparagus or green beans");
            System.out.println("\n-----SNACK #3-----");
            System.out.println("(*) Greek yogurt with sliced fruit and a drizzle of honey\n");
        }else if(bmiClass.equals("Average")){
            System.out.println("Since you are average weight, we are going to generate a meal plan that prioritizes unprocessed and high protein foods to promote health");
            System.out.println("\n-----BREAKFAST-----");
            System.out.println("(*) Whole grain toast with avocado slices and a poached egg");
            System.out.println("(*) A side of mixed fruit (such as berries, melon, or grapes)");
            System.out.println("(*) A cup of green tea or black coffee");
            System.out.println("\n-----SNACK #1-----");
            System.out.println("(*) A small handful of almonds or pumpkin seeds");
            System.out.println("(*) A piece of fresh fruit (such as an apple or orange)");
            System.out.println("\n-----LUNCH-----");
            System.out.println("(*) Grilled chicken or tofu salad with mixed greens, cherry tomatoes, cucumber, and a light vinaigrette dressing");
            System.out.println("(*) A side of quinoa or brown rice");
            System.out.println("(*) A cup of vegetable soup");
            System.out.println("\n-----SNACK #2-----");
            System.out.println("(*) Carrot sticks with hummus or a Greek yogurt dip");
            System.out.println("\n-----Dinner-----");
            System.out.println("(*) Baked salmon or roasted chicken breast");
            System.out.println("(*) Steamed vegetables (such as broccoli, cauliflower, and carrots)");
            System.out.println("(*) A small serving of whole wheat pasta or sweet potatoes");
            System.out.println("\n-----SNACK #3-----");
            System.out.println("(*) A small portion of Greek yogurt with a sprinkle of granola and berries\n");
        }else{
            System.out.println("Since you are over weight, we are going to generate a meal plan that prioritizes controlled portion sizes to promote weight loss.");
            System.out.println("\n-----BREAKFAST-----");
            System.out.println("(*) Veggie omelette made with egg whites or a combination of whole eggs and egg whites, filled with sautéed vegetables like spinach, bell peppers, and mushrooms");
            System.out.println("(*) Whole grain toast or a small portion of oatmeal");
            System.out.println("(*) A side of mixed fruit or a small fruit salad");
            System.out.println("\n-----SNACK #1-----");
            System.out.println("(*) Greek yogurt with a handful of mixed nuts or seeds");
            System.out.println("\n-----LUNCH-----");
            System.out.println("(*) Grilled chicken or fish (such as salmon or cod) with a generous portion of mixed vegetables, lightly steamed or sautéed");
            System.out.println("(*) A side salad with mixed greens, cherry tomatoes, cucumbers, and a light vinaigrette dressing");
            System.out.println("\n-----SNACK #2-----");
            System.out.println("(*) Sliced bell peppers, carrot sticks, or celery sticks with hummus");
            System.out.println("\n-----Dinner-----");
            System.out.println("(*) Baked or grilled lean protein (chicken breast, turkey breast, or tofu) seasoned with herbs and spices");
            System.out.println("(*) A serving of roasted or steamed vegetables (broccoli, cauliflower, Brussels sprouts, or asparagus)");
            System.out.println("(*) A small portion of quinoa, brown rice, or sweet potatoes");
            System.out.println("\n-----SNACK #3-----");
            System.out.println("(*) A small portion of low-fat cottage cheese or Greek yogurt with a sprinkle of cinnamon and a few berries\n");
        }

    }
    private static String restDays(int Days){
        String[] weekDays = {"Monday","Tuesday","Wednesday","Thursday"};
        String result = "Monday, ";

        for(int i = 1; i < 7-Days; i++){
            result += weekDays[i] + ", ";
        }
        if(Days >4){
            for(int j = result.length()-2; j > 0; j--){
                if(result.charAt(j)==' '){
                    result = result.substring(0,j) + " and"+ result.substring(j);
                    break;
                }
            }
        }

        return result.substring(0,result.length()-2);
    }

}