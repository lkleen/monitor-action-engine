logman start "NT Kernel Logger" -p "Windows Kernel Trace" (profile,proccntr,dpc,isr,syscall,disk,process,thread,file,dispatcher,pf,hf,img,cswitch) -bs 1024 -nb 128 128 -mode Circular -o kernel.etl -ct perf -max 512 -ets -rt