# Git -> Docker -> Docker_Hub 
## Pre-requites
1.EC2 instance
- Ubuntu OS AMI
- t2.medium
- 20GB Storage min
- Keypair
- Security Group: 1.8080 port for Jenkins page
                  2.22 port for SSH              
2.Docker installed in EC2 instance
3.Git installed in EC2 instance (Default avail in Ubuntu AMI)
4.Docker Hub account
5.Jenkins installed in EC2 instance
## Steps
1. Create a new repository in GitHub.
2. Create a new Jenkins job.
3. Configure Jenkins to use the GitHub repository.
![capture](1)
4. Configure Jenkins to build the Docker image.
>[Pipeline](jenkins_file.groovy)
-  

![alt text](jpg_image)