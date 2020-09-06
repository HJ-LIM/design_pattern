public class SearchButton {
    private MyProgram myProgram;

    public SearchButton(MyProgram myProgram){
        myProgram = myProgram;
    }

    private SearchStrategy searchStrategy = new SearchStratagyAll();

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void onClick(){
        searchStrategy.search();
    }
}
