# STEPS FOR GIT HUB REPOSITORY


STEP:1 DOWNLOAD GIT
			LINK: https://git-scm.com/downloads
			
STEP: 2 CREATE ACCOUNT ON GIT HUB
			lINK: https://github.com/

STEP: 3 CREATE RESPOSITORY

GIVE: NAME AND DESCRIPTION

STEP: 4 PREPARE THE FOLDER ON YOUR LOCAL MACHINE LIKE D:/GITHUB/DEMO

STEP: 5 PREPARE THE FILE THAT YOU WANT TO UPLOAD ON GITHUB: TEXTFILE.txt

STEP: 6 OPEN CMD MOVE TO THE ROOT DIRECTORY OF YOUR LOCAL DRIVE LIKE

d:  +enter
cd GITHUB +enter
cd DEMO +enter

# RUN THE BELOW COMMANDS ONE BY ONE

> git init
> git branch -M main
> git remote add origin https://github.com/prathijnaudupa/JAVA-FSD-PHASE11.git
> git add .
> git commit -m "first commit"

# now it will ask you for the first time for authentication with below msg


	git config --global user.email "you@example.com"
  	git config --global user.name "Your Name"

# so provide your email like this

> git config --global user.email "you@example.com"

provide your username
> git config --global user.name "Your Name"

> git push -u origin main

then a new browser window will appear and ask you for authentication there you need to provide again your email and password, once it is successfull you can proceed further


# now you can check that the file uploaded successfully
---------------------------------------------------------------------------------------------

Now while using the created repository again you need to use only 3 commands

(Note: Make sure that you open cmd and move to the root directory as above you moved so far)

> git add .
> git commit -m "you msg"
> git push -u origin main





 
