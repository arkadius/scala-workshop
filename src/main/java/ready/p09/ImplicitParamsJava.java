package ready.p09;

public class ImplicitParamsJava {

    public static void main(String[] args) {
        ImplicitParamsJava app = new ImplicitParamsJava();
        app.contextPassingUsingStatic();
    }

    void contextPassingUsingStatic() {
        SessionContextHolder.getCurrentContext().setSessionId("123");

        doJobUsingStaticContext("normal");

        SessionContextHolder.getCurrentContext().clearSessionId();
    }

    void doJobUsingStaticContext(String normalParam) {
        String currentSessionId = SessionContextHolder.getCurrentContext().getSessionId();
        if (currentSessionId == null)
            System.out.println("Not logged!");
        else
            System.out.println("Logged.");
        System.out.println("Got: " + normalParam);
    }


    static class SessionContext {
        String sessionId;

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public void clearSessionId() {
            this.sessionId = null;
        }
    }

    static class SessionContextHolder {
        private static SessionContext currentContext = new SessionContext();

        public static SessionContext getCurrentContext() {
            return currentContext;
        }
    }

}
