package com.myorg;

import software.amazon.awscdk.App;

public class HelloCdkApp {
        public static void main(final String argv[]) {
                App app = new App();

                new HelloCdkStack(app, "fargate-load-balanced-service");

                app.synth();
        }
}
