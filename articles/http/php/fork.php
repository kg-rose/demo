<?php

$pid = pcntl_fork();
if ($pid == -1) {
    die('子进程创建失败');
} else if ($pid == 0) {
    // 以下代码在子进程中运行
    echo "这是子进程，pid：" . posix_getpid() . "\n";
    sleep(5);
    exit(0);
} else {
    // 以下代码在父进程中运行
    echo "这是父进程，pid：" . posix_getpid() . "\n";
    $status = 0;
    $pid = pcntl_wait($status, WUNTRACED); // 堵塞直至获取子进程退出或中断信号或调用一个信号处理器，或者没有子进程时返回错误
    echo "子进程退出，pid：" . $pid . "\n";
}