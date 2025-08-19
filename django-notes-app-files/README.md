# Overview
![notes-app-sketch](https://github.com/user-attachments/assets/e9f59d88-6271-4ff7-867a-14dde95ded28)

## Pre-requites
1. EC2 instance
   - Ubuntu OS AMI
   - t2.medium
   - 20GB Storage min
   - Keypair
   - Security Group:
     - 1. 8080 port for Jenkins page
     - 2. 22 port for SSH              
2. Docker installed in EC2 instance
3. Git installed in EC2 instance (Default avail in Ubuntu AMI)
4. Docker Hub account
5. Jenkins installed in EC2 instance

## Steps

1. Create a new repository in GitHub.
2. Create a new Jenkins job.
3. Configure Jenkins to use the GitHub repository.
![capture](1)
4. Configure Jenkins to build the Docker image.
>[Pipeline](https://github.com/Git-Prajwal-GH/Django-notes-application/blob/dac798952d0144cdcf3f9679f09c650a4ef4055c/django-notes-app-files/jenkinsfile)


<!--
![alt text](jpg_image
-->

<img width="1526" height="948" alt="image" src="https://github.com/user-attachments/assets/6897676f-1c18-49d8-a7e3-6db27b5daac1" />

<img width="1741" height="923" alt="image" src="https://github.com/user-attachments/assets/40a336d0-80e5-4753-b7cf-21469ba92efc" />

<img width="1736" height="942" alt="image" src="https://github.com/user-attachments/assets/d198c67f-192b-467a-815b-dda5b7e705f3" />
