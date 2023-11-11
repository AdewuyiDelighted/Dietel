package umlDiagramPratices;

import java.util.ArrayList;

public class Person{
    private ArrayList<Problem> problem = new ArrayList<>();

    Problem oneProblem = new Problem("name", ProblemType.BUSINESS);

    public void add(Problem prob){
        problem.add(prob);

    }
    public void solve(){
        problem.add(oneProblem);

    }
    public ArrayList<Problem> tellUnsolvedProblems(){
        return problem;
    }

}
