# Spring Boot MVP
Spring Boot Minimum Viable Product

# Build
## Build Java code
<pre><code>mvn package</code></pre>
## Build Docker 
<pre><code>docker build -t myspring .</code></pre>

# Run
<pre><code>docker run -d -p 10300:10300 -it --rm myspring</code></pre>

# Check
<pre><code>
$ docker ps
CONTAINER ID   IMAGE      COMMAND                  CREATED         STATUS         PORTS                                           NAMES
1d34a1654cb1   myspring   "java -jar jsb-0.0.1…"   4 seconds ago   Up 2 seconds   0.0.0.0:10300->10300/tcp, :::10300->10300/tcp   loving_cray
</code></pre>

# Test
<pre><code>
$  curl http://localhost:10300/welcome/John
{"data":"Welcome John"}
</code></pre>