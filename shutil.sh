cmddirname="./longcmdot"
function InitLongCmd()
{
  if [ -d $cmddirname ];then
    rm -rf $cmddirname
  fi
  
  mkdir $cmddirname
}

function ExecCmd()
{
  local filename=$1
  local cmd=$2
  $cmd > $cmddirname"/"$filename &
}

function FetchOutput()
{
  local filepath=$cmddirname"/"$1
  until [ -s $filepath"" ]
  do 
    sleep 1
  done
  cat $filepath
}

function ClearLongCmd()
{
  if [ -d $cmddirname ];then
    rm -rf $cmddirname
  fi
}

# usage:
# InitLongCmd
# ExecCmd "filename" "cmd"
# FetchOutput "filename"
# ClearLongCmd
