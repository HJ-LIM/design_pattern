public class MyProgram {

    private SearchButton searchButton = new SearchButton(this);

    public void setModeAll(){
        searchButton.setSearchStrategy(new SearchStratagyAll());
    }

    public void setModeImage(){
        searchButton.setSearchStrategy(new SearchStratagyImage());
    }

    public void setModeNews(){
        searchButton.setSearchStrategy(new SearchStratagyNews());
    }

    public void setModeMap(){
        searchButton.setSearchStrategy(new SearchStratagyMap());
    }

    public void testProgram(){
        searchButton.onClick();
        setModeImage();
        searchButton.onClick();
        setModeNews();
        searchButton.onClick();
        setModeMap();
        searchButton.onClick();
    }
}
