import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.MapSolrParams;
import org.apache.solr.common.params.ModifiableSolrParams;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SolrJ {

    private HttpSolrClient.Builder solrServer;

    private SolrJ() {
        String solrUrl = "http://localhost:8983/solr/gettingstarted";
        solrServer = new HttpSolrClient.Builder(solrUrl);
    }

    private void querying() throws IOException, SolrServerException {
        final Map<String, String> queryParamMap = new HashMap<>();
        queryParamMap.put("q", "*:*");
        queryParamMap.put("fl", "id, name");

        MapSolrParams queryParams = new MapSolrParams(queryParamMap);

        final QueryResponse response = solrServer.build().query(queryParams);
        final SolrDocumentList documents = response.getResults();

        System.out.println(documents);
    }

    private void indexingCSV() throws IOException, SolrServerException {
        ModifiableSolrParams params = new ModifiableSolrParams();
        params.set("qt", "/update");
        params.set("stream.file", "D:\\Setup\\Solr\\solr-7.6.0_bin\\example\\exampledocs\\books.csv");
        params.set("commit", "true");
        params.set("fieldnames", "id,cat,name,price,inStock,author,series_t,sequence_i,genre_s");
        final QueryResponse response = solrServer.build().query(params);
        System.out.println(response);
    }

    private void indexingFull_import() throws IOException, SolrServerException {
        ModifiableSolrParams params = new ModifiableSolrParams();
        params.set("qt", "/dataimport");
        params.set("command","full-import");
        params.set("commit", "true");
        final QueryResponse response = solrServer.build().query(params);
        System.out.println(response);
    }

    public static void main(String[] args) throws IOException, SolrServerException {
        SolrJ solrJ = new SolrJ();
        solrJ.querying();
        //solrJ.indexingCSV();
        //solrJ.indexingFull_import();
    }

    /* SolrJ Lib
    ********** LOCATION: solr-7.6.0-src\solr\solrj\lib *********
    commons-io-2.5.jar
    commons-math3-3.6.1.jar
    httpclient-4.5.3.jar
    httpcore-4.4.6.jar
    httpmime-4.5.3.jar
    jcl-over-slf4j-1.7.24.jar
    noggit-0.8.jar
    slf4j-api-1.7.24.jar
    stax2-api-3.1.4.jar
    woodstox-core-asl-4.4.1.jar
    zookeeper-3.4.11.jar

    solr-solrj-7.6.0.jar   ******NEED TO DOWNLOAD******
    */
}
