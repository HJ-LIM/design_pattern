interface SearchStrategy {
    public void search();
}

class SearchStratagyAll implements SearchStrategy{

    @Override
    public void search() {
        System.out.println("SEARCH ALL");
        // 전체검색
    }
}

class SearchStratagyImage implements SearchStrategy{

    @Override
    public void search() {
        System.out.println("SEARCH IMAGE");
        // 이미지 검색
    }
}

class SearchStratagyNews implements SearchStrategy{

    @Override
    public void search() {
        System.out.println("SEARCH NEWS");
        // 뉴스 검색
    }
}

class SearchStratagyMap implements SearchStrategy{

    @Override
    public void search() {
        System.out.println("SEARCH MAP");
        // 지도 검색
    }
}

class SearchFindAdapter implements SearchStrategy{
    private FindAlgorithm findAlgorithm;

    public SearchFindAdapter (FindAlgorithm _findAlgorithm){
        findAlgorithm = _findAlgorithm;
    }

    @Override
    public void search() {
        findAlgorithm.find(true);
    }
}