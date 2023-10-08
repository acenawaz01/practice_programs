#!/usr/bin/env bash

source $HOME/.bashrc

cd $HOME/sitespeed/script

# Alpha

docker run \
  --shm-size=1g \
  --rm \
  -v "$(pwd)":/sitespeed.io sitespeedio/sitespeed.io:24.0.0 ./alpha_1_nocache.js \
  --multi \
