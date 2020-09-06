public interface FindAlgorithm {
    public void find (boolean global);
}

class FindeMovieAltorithm implements FindAlgorithm{

    @Override
    public void find(boolean global) {
        System.out.println(
                "find movie " + (global ? " Globally" : "")
        );
    }
}