# Welcome to your CDK Java project!

This is AWS CDK  to generate cloud formation template using JAVA code to deploy and run docker image in ECS to serve a basic webpage.

The `cdk.json` file tells the CDK Toolkit how to execute your app.

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

Enjoy!

#Follow the below steps to Deploy the Infrastructure using CDK Java.

 * `install cdk`                                  npm install -g aws-cdk
 * `clone the Repo`                               [repo](https://github.com/Soowjanya28/Assignment.git)
 * `get into the directory`                       cd hello-cdk                              
 * `initialize the app`                           cdk init app --language java
 * `generate the cloud formation template`        cdk synth
 * `Bootstrap`                                    cdk bootstrap --profile {YOUR_CONFIGURED_PROFILE}
 * `Deploy`                                       cdk deploy --profile {YOUR_CONFIGURED_PROFILE}
 
### To test the served web application use the load balancer DNS
> **Warning** - Be sure to destroy all the Infrastructure that is created after Validation 
**cdk destroy --profile {YOUR_CONFIGURED_PROFILE}**
