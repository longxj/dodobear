cmddirname=""
function InitLongCmd()
{
  cmddirname=$(cat /proc/sys/kernel/random/uuid)
  
  if [ -d $cmddirname ];then
    rm -rf $cmddirname
  fi
  
  mkdir $cmddirname
}

function ExecCmd()
{
  local filename=$cmddirname"/"$1
  local flagfilename=$filename".flag"
  local cmd=$2
  $cmd > $filename && touch $flagfilename&
}

function FetchOutput()
{
  local filepath=$cmddirname"/"$1
  local flagfilepath=$filepath".flag"
    
  until [ -f $flagfilepath ]
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
