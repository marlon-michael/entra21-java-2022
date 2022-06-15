alias pushd='git add . && git commit -m "Entra21" && git push entra21-java-2022';
alias gogit='cd ~ && cd Documents/git/entra21-java-2022';

function add(){
  read -p "files: " add;
}

function push() {
  if [ "$add" = "" ]
  then
    echo default add;
    git add .;
  else
    echo add $add;
    git add $add;
    add="";
  fi
  read -p "commit: " comm;
  if [ "$comm" = "" ]
  then
    echo default commit;
    git commit -m "Entra21-2022";
  else
    echo commit: $comm;
    git commit -m "$comm";
  fi
  git push entra21;
}