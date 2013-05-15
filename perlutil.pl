#pause until press return key
sub pause()
{
  print "press return to next step...\n";
  my $p = <STDIN>;
}

#print cmd output without buffer
sub printCmd()
{
  my $cmd = pop(@_);
  open(RT, $cmd);
  my $line;
  while ($line=<RT>)
  {
    print $line;
  }
  close(RT);
}
