package main.java.design_patterns.builder.query;

@WithBuilder
public class QueryBuilder {

    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    private QueryBuilder() {}

    public static class Builder {

        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public QueryBuilder build() {
            QueryBuilder queryBuilder = new QueryBuilder();
            queryBuilder.select = this.select;
            queryBuilder.from = this.from;
            queryBuilder.where = this.where;
            queryBuilder.join = this.join;
            queryBuilder.orderBy = this.orderBy;
            queryBuilder.groupBy = this.groupBy;
            return queryBuilder;
        }
    }
}
