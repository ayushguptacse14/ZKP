# ZKP

Implement the ZKP Protocol and a Proof-of-Concept application that utilizes the protocol to register and authenticate users.

## Getting Started

Clone the repo:

```sh
git clone https://github.com/ayushguptacse14/ZKP.git
```

Move into the project directory:

```sh
cd ZKP
```

Run the Dapp in Docker Container. 

```sh
docker-compose up -d --build
```

Register Command 

```sh
./build/install/examples/bin/zkp-client -register username Id(Int)
```

Login Command 

```sh
./build/install/examples/bin/zkp-client -login username Id(Int)
```
