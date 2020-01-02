public class ElectionsWinners {
    //Elections are in progress!
    //Given an array of the numbers of votes given to each
    // of the candidates so far, and an integer k equal to the number
    // of voters who haven't cast their vote yet, find the number of
    // candidates who still have a chance to win the election.
    //The winner of the election must secure strictly more votes than any other candidate.
    // If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.
    int electionsWinners(int[] votes, int k) {

        int winner = 0;
        int chanse = 0;
        int count = 0;
        for(int i : votes){
            if(i > winner)
                winner = i;
        }
        for(int j : votes){
            if(j+k > winner)
                chanse++;
            else if(winner==j)
                count++;
        }
        return count==1?1:chanse;
    }

}
