package leetCodeDailyQuestions;

import java.util.*;

public class FindAllRecipes21032025 {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String>result=new ArrayList<>();
        List<String>newSupplies=new ArrayList<>(Arrays.stream(supplies).toList());
        boolean addedNewRecipe;

        do {
            addedNewRecipe = false;
            for (int i = 0; i < recipes.length; i++) {
                if (!result.contains(recipes[i]) && check(ingredients.get(i), newSupplies)) {
                    result.add(recipes[i]);
                    newSupplies.add(recipes[i]);
                    addedNewRecipe = true;
                }
            }
        } while (addedNewRecipe);

        return result;


    }

    private static boolean check(List<String> list, List<String> newSupplies) {

        for (String s:list){
            if(!newSupplies.contains(s)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] recipes = {"bread", "sandwich", "burger"};
        List<List<String>> ingredients = List.of(
                List.of("yeast", "flour"),
                List.of("bread", "meat"),
                List.of("sandwich", "meat", "bread")
        );
        String[] supplies = {"yeast", "flour", "meat"};

        System.out.println(findAllRecipes(recipes, ingredients, supplies));
    }
}
