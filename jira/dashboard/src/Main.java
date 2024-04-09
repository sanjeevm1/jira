public class Main {
    public static void main(String[] args) {

        HttpResponse<JsonNode> response = Unirest.get("https://your-domain.atlassian.net/rest/api/3/dashboard")
                .basicAuth("email@example.com", "<api_token>")
                .header("Accept", "application/json")
                .asJson()
    }
}